package com.zx.back.model;

import java.util.List;

public class User {


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uid
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.uname
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.psd
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String psd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.adress
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    private String adress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uid
     *
     * @return the value of user.uid
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uid
     *
     * @param uid the value for user.uid
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.uname
     *
     * @return the value of user.uname
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.uname
     *
     * @param uname the value for user.uname
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.psd
     *
     * @return the value of user.psd
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getPsd() {
        return psd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.psd
     *
     * @param psd the value for user.psd
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setPsd(String psd) {
        this.psd = psd == null ? null : psd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.adress
     *
     * @return the value of user.adress
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public String getAdress() {
        return adress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.adress
     *
     * @param adress the value for user.adress
     *
     * @mbggenerated Thu Apr 11 20:36:23 CST 2019
     */
    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}