SELECT * FROM x_goods WHERE 1=1
<#if xGoods.Name ?exists && xGoods.Name ?length gt 0>
	and Name = :xGoods.Name
</#if>
<#if xGoods.goodsID ?exists && xGoods.goodsId ?length gt 0>
	and goodsID = :xGoods.goodsId
</#if>
<#if xGoods.price ?exists && xGoods.price ?length gt 0>
	and price = :xGoods.price
</#if>
<#if xGoods.entryTime ?exists && xGoods.entryTime ?length gt 0>
	and entryTime = :xGoods.entryTime
</#if>
<#if xGoods.inventory ?exists && xGoods.inventory ?length gt 0>
	and inventory = :xGoods.inventory
</#if>
