-- https://dimitr.im/loading-initial-data-with-spring
INSERT INTO quote (quote) values ('first quote');
INSERT INTO quote (quote) values ('second quote');

INSERT INTO PAYLOAD VALUES (1, 'Payload One');
INSERT INTO ACCOUNT VALUES (1, 'Account One');
INSERT INTO FAMILY VALUES (1, 'Family One');

INSERT INTO CATEGORY VALUES(1, 'Category One');
INSERT INTO CATEGORY VALUES (2, 'Category Two');
INSERT INTO CATEGORY VALUES (3, 'Category Three');

INSERT INTO LIST_FAMILY (PAYLOAD_ID, ACCOUNT_ID, FAMILY_ID, NAME) VALUES (1,1,1, 'Relation One');

INSERT INTO LIST_CATEGORY VALUES (1,1,1,1);
INSERT INTO LIST_CATEGORY VALUES (1,1,1,2);
INSERT INTO LIST_CATEGORY VALUES (1,1,1,3);