package cmd;

import recv.ConfigOperator;

import java.io.Serializable;

/**
 * 抽象配置命令类
 */
public abstract class ConfigCommand implements Serializable {
    protected String name;
    protected String args;
    protected ConfigOperator configOperator;

    public ConfigCommand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute();

    public abstract void execute(String args);
}
