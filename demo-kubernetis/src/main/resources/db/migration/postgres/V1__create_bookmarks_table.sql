CREATE SEQUENCE IF NOT EXISTS bm_id_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE bookmarks
(
    id         BIGINT       NOT NULL DEFAULT nextval('bm_id_seq'),
    title      VARCHAR(255) NOT NULL,
    url        VARCHAR(255) NOT NULL,
    created_at TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_bookmarks PRIMARY KEY (id)
);