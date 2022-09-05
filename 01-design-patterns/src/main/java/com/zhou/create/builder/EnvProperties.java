package com.zhou.create.builder;

import org.apache.commons.lang3.StringUtils;

/**
 * 可以有三种情况。
 * 1.用户名+密码
 * 2.用户名+私钥
 * 3.配置文件地址
 *
 * @author zhoubing
 * @date 2022-09-04 23:02
 */
public class EnvProperties {

    private String userName;
    private String password;
    // 私钥
    private String sshPrivateKey;

    private String envPath;

    private EnvProperties() {
    }

    public static EnvPropertiesBuilder newBuilder() {
        return new EnvPropertiesBuilder();
    }

    public static class EnvPropertiesBuilder {
        private String userName;
        private String password;
        // 私钥
        private String sshPrivateKey;

        private String envPath;

        public EnvPropertiesBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public EnvPropertiesBuilder password(String password) {
            this.password = password;
            return this;
        }

        public EnvPropertiesBuilder sshPrivateKey(String sshPrivateKey) {
            this.sshPrivateKey = sshPrivateKey;
            return this;
        }

        public EnvPropertiesBuilder envPath(String envPath) {
            this.envPath = envPath;
            return this;
        }

        public EnvProperties build() {
            // * 可以有三种情况。
            // * 1.用户名+密码
            // * 2.用户名+私钥
            // * 3.配置文件地址
            if (checkUserNameAndPasswordNotNull() || checkUserNameAndSshFileNotNull() || checkEnvPathNotNull()) {

            } else {
                throw new IllegalArgumentException("参数有误，必须为以下三种情况之一。 * 1.用户名+密码\n" +
                        "             * 2.用户名+私钥\n" +
                        "             * 3.配置文件地址");
            }

            EnvProperties envProperties = new EnvProperties();
            envProperties.sshPrivateKey = this.sshPrivateKey;
            envProperties.userName = this.userName;
            envProperties.password = this.password;
            envProperties.envPath = this.envPath;

            return envProperties;
        }

        private boolean checkEnvPathNotNull() {
            return StringUtils.isNotBlank(this.envPath);
        }

        private boolean checkUserNameAndSshFileNotNull() {
            return StringUtils.isNotEmpty(this.userName) && StringUtils.isNotEmpty(this.sshPrivateKey);
        }

        private boolean checkUserNameAndPasswordNotNull() {
            return StringUtils.isNotEmpty(this.userName) && StringUtils.isNotEmpty(this.password);
        }
    }

}
