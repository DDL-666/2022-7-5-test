package com.bjpowernode.service;

import com.bjpowernode.pojo.ProductInfo;
import com.bjpowernode.pojo.vo.ProductInfoVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProductInfoService {
    //显示全部商品（不分页）
    List<ProductInfo> getAll();


    //分页功能实现
    PageInfo splitPage(int pageNum, int pageSize);//pagnum-当前页 pagesize-每页有多少个数据

    //添加商品
    int save(ProductInfo info);

    //编辑商品
    //按主键id查询商品
    ProductInfo getByID(int pid);

    //更新商品
    int update(ProductInfo info);

    //单个商品删除
    int delete(int pid);

    //批量删除
    int deleteBatch(String []ids);

    //多条件查询
    List<ProductInfo> selectCondition(ProductInfoVo vo);

    //多条件查询可分页
    public PageInfo splitPageVo(ProductInfoVo vo,int pageSize);
}
