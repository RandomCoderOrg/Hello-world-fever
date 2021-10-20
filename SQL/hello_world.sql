Set serveroutput on;
-- Type the above command before executing any SQL program.

-- Hello World Program in SQL (Type 1)

begin
dbms_output.put_line('Hello World');
end;
/

-- Hello World Program in SQL (Type 2)

DECLARE
message varchar2(20):= 'Hello, World!';
BEGIN
dbms_output.put_line(message);
END;
/


