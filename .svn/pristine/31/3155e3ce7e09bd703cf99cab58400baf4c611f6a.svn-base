SELECT * FROM x_notice WHERE 1=1
<#if xNotice.issuedTime ?exists && xNotice.issuedTime ?length gt 0>
	and issuedTime = :xNotice.issuedTime
</#if>
<#if xNotice.attribute ?exists && xNotice.attribute ?length gt 0>
	and attribute = :xNotice.attribute
</#if>
<#if xNotice.title ?exists && xNotice.title ?length gt 0>
	and title = :xNotice.title
</#if>
<#if xNotice.author ?exists && xNotice.author ?length gt 0>
	and author = :xNotice.author
</#if>
<#if xNotice.msg ?exists && xNotice.msg ?length gt 0>
	and msg = :xNotice.msg
</#if>
