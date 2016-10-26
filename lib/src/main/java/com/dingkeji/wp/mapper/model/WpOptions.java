package com.dingkeji.wp.mapper.model;

public class WpOptions {
    /**
     *  ,所属表字段为wp_options.option_id
     */
    private Long optionId;

    /**
     *  ,所属表字段为wp_options.option_name
     */
    private String optionName;

    /**
     *  ,所属表字段为wp_options.option_value
     */
    private String optionValue;

    /**
     *  ,所属表字段为wp_options.autoload
     */
    private String autoload;

    /**
     * 获取  字段:wp_options.option_id
     *
     * @return wp_options.option_id, 
     */
    public Long getOptionId() {
        return optionId;
    }

    /**
     * 设置  字段:wp_options.option_id
     *
     * @param optionId wp_options.option_id, 
     */
    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    /**
     * 获取  字段:wp_options.option_name
     *
     * @return wp_options.option_name, 
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * 设置  字段:wp_options.option_name
     *
     * @param optionName wp_options.option_name, 
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    /**
     * 获取  字段:wp_options.option_value
     *
     * @return wp_options.option_value, 
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * 设置  字段:wp_options.option_value
     *
     * @param optionValue wp_options.option_value, 
     */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }

    /**
     * 获取  字段:wp_options.autoload
     *
     * @return wp_options.autoload, 
     */
    public String getAutoload() {
        return autoload;
    }

    /**
     * 设置  字段:wp_options.autoload
     *
     * @param autoload wp_options.autoload, 
     */
    public void setAutoload(String autoload) {
        this.autoload = autoload == null ? null : autoload.trim();
    }
}