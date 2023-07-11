CREATE TABLE TEST (
    PNO  NUMBER(4,0) NOT NULL , 
	PNAME VARCHAR2(10) NOT NULL,
	PDATE  DATE 
);
ROLLBACK;
DROP TABLE TEST;

INSERT INTO TEST (PNO,PNAME,PDATE) VALUES(1,'TEST',SYSDATE);
SELECT TO_CHAR(DBMS_METADATA.GET_DDL('TABLE','TEST'))
FROM DUAL;
SELECT * 
FROM TEST;

COMMIT;

select * 
from dba_tab_modifications 
where table_owner not in ('SYS', 'SYSTEM')                   
order by 1,2,3;
SELECT INSERTS, UPDATES, DELETES
FROM DBA_TAB_MODIFICATIONS
WHERE TABLE_NAME = 'TEST';

SELECT DEPTNO, EMPNO, ENAME, SAL  FROM EMP ORDER BY 4 DESC;

SELECT   DEPTNO, EMPNO, ENAME, SAL  
        ,RANK() OVER(ORDER BY SAL DESC) AS RK
        ,DENSE_RANK() OVER(ORDER BY SAL DESC) AS DR
        ,ROW_NUMBER() OVER(ORDER BY SAL DESC) AS RN
FROM     EMP; 