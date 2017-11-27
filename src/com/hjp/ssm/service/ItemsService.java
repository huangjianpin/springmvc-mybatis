package com.hjp.ssm.service;

import com.hjp.ssm.po.ItemsCustom;

public interface ItemsService {

	ItemsCustom findItemsById(Integer id) throws Exception;
}
