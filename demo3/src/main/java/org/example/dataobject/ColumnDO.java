package org.example.dataobject;

public class ColumnDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column.id
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column.columnID
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    private String columnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column column.columnName
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    private String columnname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column.id
     *
     * @return the value of column.id
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column.id
     *
     * @param id the value for column.id
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column.columnID
     *
     * @return the value of column.columnID
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    public String getColumnid() {
        return columnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column.columnID
     *
     * @param columnid the value for column.columnID
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    public void setColumnid(String columnid) {
        this.columnid = columnid == null ? null : columnid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column column.columnName
     *
     * @return the value of column.columnName
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    public String getColumnname() {
        return columnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column column.columnName
     *
     * @param columnname the value for column.columnName
     *
     * @mbg.generated Wed Mar 10 19:49:37 CST 2021
     */
    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }
}