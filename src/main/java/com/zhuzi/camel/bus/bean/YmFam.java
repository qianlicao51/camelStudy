package com.zhuzi.camel.bus.bean;

import java.io.Serializable;
import java.util.Date;

public class YmFam implements Serializable {
    /**
     * Database Column Remarks:
     *   id
     * 表：ym_fam
     * 字段：id
     * 注释：id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   名称
     * 表：ym_fam
     * 字段：name
     * 注释：名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   农历
     * 表：ym_fam
     * 字段：birthN
     * 注释：农历
     *
     * @mbggenerated
     */
    private Integer birthn;

    /**
     * Database Column Remarks:
     *   阳历
     * 表：ym_fam
     * 字段：birthG
     * 注释：阳历
     *
     * @mbggenerated
     */
    private Integer birthg;

    /**
     * Database Column Remarks:
     *   祝福语
     * 表：ym_fam
     * 字段：wish
     * 注释：祝福语
     *
     * @mbggenerated
     */
    private String wish;

    /**
     * Database Column Remarks:
     *   创建时间
     * 表：ym_fam
     * 字段：CreateTime
     * 注释：创建时间
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * Database Column Remarks:
     *   添加人(主要是为了让人加入更多他人生日)
     * 表：ym_fam
     * 字段：addid
     * 注释：添加人(主要是为了让人加入更多他人生日)
     *
     * @mbggenerated
     */
    private String addid;

    /**
     * Database Column Remarks:
     *   图片路径
     * 表：ym_fam
     * 字段：picpath
     * 注释：图片路径
     *
     * @mbggenerated
     */
    private String picpath;

    /**
     * Database Column Remarks:
     *   1显示 0不显示
     * 表：ym_fam
     * 字段：isshow
     * 注释：1显示 0不显示
     *
     * @mbggenerated
     */
    private String isshow;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBirthn() {
        return birthn;
    }

    public void setBirthn(Integer birthn) {
        this.birthn = birthn;
    }

    public Integer getBirthg() {
        return birthg;
    }

    public void setBirthg(Integer birthg) {
        this.birthg = birthg;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish == null ? null : wish.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getAddid() {
        return addid;
    }

    public void setAddid(String addid) {
        this.addid = addid == null ? null : addid.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getIsshow() {
        return isshow;
    }

    public void setIsshow(String isshow) {
        this.isshow = isshow == null ? null : isshow.trim();
    }

    @Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", birthn=").append(birthn);
        sb.append(", birthg=").append(birthg);
        sb.append(", wish=").append(wish);
        sb.append(", createtime=").append(createtime);
        sb.append(", addid=").append(addid);
        sb.append(", picpath=").append(picpath);
        sb.append(", isshow=").append(isshow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
    public YmFam(){

    }
}