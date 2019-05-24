--É¾³ý¼Æ»®
/*
delete from seniorTalent_orderExecuteTime 
where sfzh = '331082198906080018'
delete from seniorTalent_orderInfo
    where sfzh = '331082198906080018'
update [seniorTalent] set orderNo = 0
where sfzh = '331082198906080018'
*/

select goalTime, goalStr, goalValue, unit from seniorTalent_orderPrint_goal
where zfpb = 0 and sfzh = '331082198906080018'