<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>TextStarts</name>
   <tag></tag>
   <elementGuidId>223e513a-299a-471b-910b-8371a0664b7a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>android.widget.TextView</value>
      <webElementGuid>551cbe7f-bef7-47cf-9de2-48bd29b11609</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>starts with</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${Verify}</value>
      <webElementGuid>cb077b80-8418-49b6-a575-045cfae6a825</webElementGuid>
   </webElementProperties>
   <locator>//*[@class = 'android.widget.TextView' and (starts-with(@text, '${Verify}') or starts-with(., '${Verify}'))]</locator>
   <locatorStrategy>ATTRIBUTES</locatorStrategy>
</MobileElementEntity>
