package dao;

import model.SystemDO;

public interface SystemDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    int insert(SystemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    int insertSelective(SystemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    SystemDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    int updateByPrimaryKeySelective(SystemDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    int updateByPrimaryKey(SystemDO record);
}