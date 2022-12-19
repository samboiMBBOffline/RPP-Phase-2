<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>PrecedingIDType</name>
   <tag></tag>
   <elementGuidId>15ae63e3-6b28-4daa-93a8-9e3a8bce9ca0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>android.widget.TextView</value>
      <webElementGuid>be88036e-9ae0-4a64-802b-5fc5940ae068</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${Verify}</value>
      <webElementGuid>c17ff28c-55b8-4e7e-ad62-2ab78c0ed977</webElementGuid>
   </webElementProperties>
   <locator>(//*[@class = 'android.widget.TextView' and (@text = '${Verify}' or . = '${Verify}')]//preceding-sibling::android.widget.TextView)[2]</locator>
   <locatorStrategy>XPATH</locatorStrategy>
</MobileElementEntity>
