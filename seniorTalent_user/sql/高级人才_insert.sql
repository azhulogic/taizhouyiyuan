--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('章安逸', '331022201802260223', 2, '2018-02-26', '13566882226', '健跳镇居民', '5002341673','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('郑筱丽', '331003199001031341', 2, '1990-01-03', '13989615867', '头陀镇双楠村', '5002341969','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('周佳翰', '331023201708141478', 1, '2017-08-14', '15058630700', '白鹤镇上西山村', '5002342050','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('刘子湘', '330204201005265029', 2, '2010-05-26', '18606595700', '实验小学', '5001520960','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('柯伟芬', '332624198010082125', 2, '1980-10-08', '18815230267', '前园村', '5001520962','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('朱欣培', '331082199909182380', 2, '1999-09-18', '18358692299', '临海柏叶路', '5001520965','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('江夏雨', '331082198906080018', 1, '1989-06-08', '13819622712', '浙江临海农村商业银行股份有限公司', '5001519992','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('王子萌', '331082201105200029', 2, '2011-05-20', '15557675119', '花街社区', '5001520001','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('顾文君', '332603196501271325', 2, '1965-01-27', '13524468159', '黄岩区头陀镇胡岙村', '5002341766','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('尤浩杨', '331082201809097971', 1, '2018-09-09', '18838737839', '沙基村', '5002341780','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('金聪聪', '33108219930921350X', 2, '1993-09-21', '13666849121', '岭脚金村', '5002341887','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('包爱萍', '33260219751011694X', 2, '1975-10-11', '13666468515', '蓬街镇联东村7组22户', '5002341899','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('蔡晓云', '340621197910118767', 2, '1979-10-11', '18705863338', '西溪村', '5002341914','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,yq,disease,zfpb) values
--('王皿妹', '332625196205106841', 2, '1962-05-10', '15967054406', '三合镇大横村', '5002341923','01','1',0);
--insert into SeniorTalent (name,sfzh,brxb,csny,lxdh,lxdz,mzhm,zyhm,brid,yq,disease,zfpb) values
--('王皿妹', '332625196205106841', 2, '1962-05-10', '15967054406', '三合镇大横村', '5002341923','','','01','1',0);

insert into SeniorTalent_diseaseInfo values(0,'暂未分组',0);
insert into SeniorTalent_diseaseInfo values(1,'亚健康管理组',0);
insert into SeniorTalent_diseaseInfo values(2,'慢病管理组',0);
insert into SeniorTalent_diseaseInfo values(3,'疾病管理组',0);
insert into SeniorTalent_diseaseInfo values(4,'健康管理组',0);
insert into SeniorTalent_diseaseInfo values(99,'问卷组',0);


insert into SeniorTalent_sflx(diseaseNo,name,zfpb) values(1,'糖尿病sflx1',0);
insert into SeniorTalent_sflx(diseaseNo,name,zfpb) values(1,'糖尿病sflx2',0);
insert into SeniorTalent_sflx(diseaseNo,name,zfpb) values(2,'高血脂sflx1',0);
insert into SeniorTalent_sflx(diseaseNo,name,zfpb) values(2,'高血脂sflx2',0);
insert into SeniorTalent_sflx(diseaseNo,name,zfpb) values(3,'高血压sflx1',0);
insert into SeniorTalent_sflx(diseaseNo,name,zfpb) values(3,'高血压sflx2',0);


insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(1,1,'糖尿病sflxmx1',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(1,1,'糖尿病sflxmx2',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(1,2,'糖尿病sflxmx3',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(1,2,'糖尿病sflxmx4',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(2,3,'高血脂sflx1',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(2,3,'高血脂sflx2',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(2,4,'高血脂sflx3',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(2,4,'高血脂sflx4',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(3,5,'高血压sflx1',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(3,5,'高血压sflx2',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(3,6,'高血压sflx3',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(3,6,'高血压sflx4',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(99,9,'谷薯类(两)',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(99,9,'蔬菜类(斤)',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(99,10,'运动时间',0);
insert into SeniorTalent_sflxmx(diseaseNo,sflxNo,name,zfpb) values(99,10,'运动频率',0);


insert into SeniorTalent_pushContent(pushContentValue) values ('请到台州医院老门诊305室接受糖尿病教育，以便更好控制您的血糖！请到台州医院老门诊305室接受糖尿病教育，以便更好控制您的血糖！');
insert into SeniorTalent_pushContent (pushContentValue) values ('饮食：饮食清淡、少油少盐，控制总热量，食物品种多样化，主食、蔬果、肉、蛋、鱼合理搭配。');
insert into SeniorTalent_pushContent (pushContentValue) values ('专用病历1、携带病历卡和身份证-> 医生处就诊 -> 门诊办 ->收费窗口8号交100元押金即可;2、如为代办人：携带患者及代办人的身份证和患者的病历卡-> 医生处就诊 ->门诊办->收费窗口8号交100元押金即可');

insert into SeniorTalent_healthResult_xm(xmName) values ('膳食结构不合理、不良饮食习惯');
insert into SeniorTalent_healthResult_xm(xmName) values ('喝水太少');
insert into SeniorTalent_healthResult_xm(xmName) values ('久坐不动');
insert into SeniorTalent_healthResult_xm(xmName) values ('吸烟、酗酒');
insert into SeniorTalent_healthResult_xm(xmName) values ('睡眠不足、压力大');
insert into SeniorTalent_healthResult_xm(xmName) values ('疾病状态');
insert into SeniorTalent_healthResult_xm(xmName) values ('其它病史');
insert into SeniorTalent_healthResult_xm(xmName) values ('消瘦');
insert into SeniorTalent_healthResult_xm(xmName) values ('超重肥胖');

insert into SeniorTalent_order_xm(orderXmName) values ('知识推送');
insert into SeniorTalent_order_xm(orderXmName) values ('饮食监控');
insert into SeniorTalent_order_xm(orderXmName) values ('健康体检');
insert into SeniorTalent_order_xm(orderXmName) values ('体重监控');
insert into SeniorTalent_order_xm(orderXmName) values ('运动监控');
insert into SeniorTalent_order_xm(orderXmName) values ('饮水量监控');
insert into SeniorTalent_order_xm(orderXmName) values ('烟酒量监控');
insert into SeniorTalent_order_xm(orderXmName) values ('睡眠监控');
insert into SeniorTalent_order_xm(orderXmName) values ('服药监控');
insert into SeniorTalent_order_xm(orderXmName) values ('血压监控');
insert into SeniorTalent_order_xm(orderXmName) values ('化验指标监控');
insert into SeniorTalent_order_xm(orderXmName) values ('单项指标跟踪');
insert into SeniorTalent_order_xm(orderXmName) values ('专科医生面诊');
insert into SeniorTalent_order_xm(orderXmName) values ('心理疏导');
insert into SeniorTalent_order_xm(orderXmName) values ('健康讲座');
insert into SeniorTalent_order_xm(orderXmName) values ('健康俱乐部');

insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (1, 1, '三餐搭配、食谱营养、四季合理饮食相关知识');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (1, 2, '三餐饮食情况，监控（1-3个月）');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (1, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (1, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (1, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (2, 1, '人体水分需求、三餐搭配、食谱营养、四季合理饮食相关知识');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (2, 6, '三餐饮食情况，监控（1-3个月）');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (2, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (2, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (2, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (3, 1, '科学运动相关知识、运动与疾病知识，运动方式推荐');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (3, 5, '每日运动量记录,监控1个月');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (3, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (3, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (3, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (4, 1, '四季养生健康知识推送、烟酒相关危害等知识');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (4, 7, '每日烟酒量记录,监控1-2个月');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (4, 3, '体检项目选择、重点肝，肺');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (4, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (4, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (5, 1, '健康睡眠及心理相关等知识');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (5, 8, '每日记录睡眠情况,监控1个月');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (5, 14, '面诊或俱乐部活动');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (5, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (5, 15, '专家讲座（重点心理讲座）');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (5, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 1, '疾病相关知识推送');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 11, '异常指标复查');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 9, '服药剂量、时间');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 10, '血压数据上传');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 13, '面诊');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (6, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (7, 1, '健康相关知识推送');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (7, 12, '单项指标复查');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (7, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (7, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (7, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (8, 1, '三餐搭配、食谱营养、四季合理饮食相关知识');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (8, 4, '体重数据');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (8, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (8, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (8, 16, '');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 1, '三餐搭配、食谱营养、四季合理饮食相关知识');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 4, '体重数据');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 2, '三餐饮食情况，监控1个月');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 5, '每日运动量记录,监控1个月');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 12, '血压、血生化、营养体脂、肝胆B超等');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 3, '体检项目选择');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 15, '专家讲座');
insert into SeniorTalent_order_xmmx(healthResultXmNo, orderXmNo, orderXmmxName) values (9, 16, '');


insert into SeniorTalent_order_option (xmName, optionName, optionValue, optionXuhao) values ('orderHowOften', '一天一次', 1, 1)
insert into SeniorTalent_order_option (xmName, optionName, optionValue, optionXuhao) values ('orderHowOften', '一个月一次', 30, 2)
insert into SeniorTalent_order_option (xmName, optionName, optionValue, optionXuhao) values ('orderHowOften', '一个季度一次', 90, 3)
insert into SeniorTalent_order_option (xmName, optionName, optionValue, optionXuhao) values ('orderHowOften', '半年一次', 180, 4)
insert into SeniorTalent_order_option (xmName, optionName, optionValue, optionXuhao) values ('orderHowOften', '一年一次', 360, 5)

insert into seniorTalent_orderPrint_healthResult_xmmx(healthResultXmNo, healthResultXmmxName, unit)
values (10, '血压', 'mmHg')
insert into seniorTalent_orderPrint_healthResult_xmmx(healthResultXmNo, healthResultXmmxName, unit)
values (11, '血糖', 'mmol/L')
insert into seniorTalent_orderPrint_healthResult_xmmx(healthResultXmNo, healthResultXmmxName, unit)
values (13, '甘油三酯', 'mmol/L')
insert into seniorTalent_orderPrint_healthResult_xmmx(healthResultXmNo, healthResultXmmxName, unit)
values (13, '低密度脂蛋白胆固醇', 'mmol/L')
insert into seniorTalent_orderPrint_healthResult_xmmx(healthResultXmNo, healthResultXmmxName, unit)
values (14, '血尿酸', 'umoL/L')

insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '血压渐降至≤', 'mmhg', 1)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '掌握标准测量血压方法', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '掌握自我控制血压相关技能', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '不良生活方式逐渐改变', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '全年累计有9个月以上时间血压控制在≤', 'mmhg', 1)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '不良生活方式逐渐改变', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '没有靶器官损害', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '坚持规范药物治疗', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '不良生活方式显著改变', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '上半年累计有4.5个月以上时间血压控制在≤140/90mmHg', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(10, '下半年累计有4.5个月以上时间血压控制在≤140/90mmHg', '', 0)

insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '掌握标准测量血糖方法', '', 0)
/*insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '血糖控制平稳（空腹：3.9-7.2mmol/L或非空腹：<3.9-7.2mmol/L10.0mmol/L）', '', 0)*/
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '掌握糖尿病饮食疗法', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '掌握血压、体重自我监测技能', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '掌握糖尿病运动疗法', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '掌握低血糖值及症状、急救方法', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '不良生活方式显著改变', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '坚持规范糖尿病治疗', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '无糖尿病并发症发生', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '已发生的糖尿病并发症稳定', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(11, '糖化血红蛋白<', '%', 1)

insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '甘油三酯低于', 'mmol/L', 1)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '低密度脂蛋白胆固醇低于', 'mmol/L', 1)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '低脂饮食', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '控制理想体重', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '戒烟', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '限量饮酒', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '规范药物治疗', '', 0)
insert into seniorTalent_orderPrint_goal_xmmx(healthResultXmNo, goalXmmxName, unit, hasValueBz)
values(13, '无动脉粥样硬化、冠心病、胰腺炎、高血压、脑中风等并发症', '', 0)

insert into seniorTalent_orderPrint_healthCheck_xm(healthCheckXmName, bz) values ('检验项目', '')
insert into seniorTalent_orderPrint_healthCheck_xm(healthCheckXmName, bz) values ('心电图、超声项目', '')
insert into seniorTalent_orderPrint_healthCheck_xm(healthCheckXmName, bz) values ('X线、CT、MR等项目', '孕妇不检，准备怀孕的慎检')
insert into seniorTalent_orderPrint_healthCheck_xm(healthCheckXmName, bz) values ('妇科项目', '根据本人情况选择,未婚者禁检')
insert into seniorTalent_orderPrint_healthCheck_xm(healthCheckXmName, bz) values ('其他', '')

insert into seniorTalent_orderPrint_healthCheck_xmmx(healthCheckXmNo, healthCheckXmmxName, price) 
values (1, '血常规+血沉：三大常规检查之一。检查血液中红细胞、白细胞、血小板、血红蛋白等', '19.00')
insert into seniorTalent_orderPrint_healthCheck_xmmx(healthCheckXmNo, healthCheckXmmxName, price) 
values (1, '血生化（肝、肾功能、血脂、血糖）', '68.00')
insert into seniorTalent_orderPrint_healthCheck_xmmx(healthCheckXmNo, healthCheckXmmxName, price) 
values (2, '心电图', '10.00')
insert into seniorTalent_orderPrint_healthCheck_xmmx(healthCheckXmNo, healthCheckXmmxName, price) 
values (3, '胸部正位片（提供DR.图文报告，需打印胶片另收费21.00元）', '43.00')
insert into seniorTalent_orderPrint_healthCheck_xmmx(healthCheckXmNo, healthCheckXmmxName, price) 
values (4, '妇科+白带常规', '30.00')
insert into seniorTalent_orderPrint_healthCheck_xmmx(healthCheckXmNo, healthCheckXmmxName, price) 
values (5, 'C14呼气试验：胃幽门螺杆菌感染检测及根除治疗后复查（注：孕妇、哺乳期慎检）', '85.00')