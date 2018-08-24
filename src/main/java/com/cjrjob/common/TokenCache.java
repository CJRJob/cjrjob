package com.cjrjob.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Author: LR
 * @Descriprition: 把Token放进cache中
 * @Date: Created in 20:34 2018/6/10
 * @Modified By:
 **/

@Slf4j
public class TokenCache {

    /**
     * 声明一个静态的内存块
     * LoadingCache Guava里面的本地缓存
     * CacheBuilder 构建本地缓存 调用链模式
     * initialCapacity(1000) 设置缓存的初始化容量
     * maximumSize(10000) 设置缓存的最大容量 当超过这个容量的时候Guava的Cache 会使用LRU算法（最小使用算法）来移除缓存项
     * expireAfterAccess (数量, 单位)设置有效期
     * build 抽象类  写匿名实现 或单独写一个实现类
     */
    private static LoadingCache<String, String> loadCache = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000)
            .expireAfterAccess(12,TimeUnit.HOURS)
            // 匿名实现类
            .build(new CacheLoader<String, String>() {
                // 默认的数据加载实现， 当调用get取值的时候，如果key没有对应的值的话，就调用这个方法进行加载
                @Override
                public String load(String s) throws Exception {
                    return "null";
                }
            });

    public static void setKey(String key, String value){
        loadCache.put(key, value);
    }

    public static String getKey(String key){
        String value = null;
        try {
            value = loadCache.get(key);
            if ("null".equals(value)) {
                return null;
            }
            return value;
        }catch (Exception e){
            log.error("loadCache get error", e);
        }
        return null;
    }
}
