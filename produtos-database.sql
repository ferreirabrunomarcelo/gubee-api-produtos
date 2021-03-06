PGDMP         :    
            y            produtos    10.17    10.17     
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                       1262    49207    produtos    DATABASE     ?   CREATE DATABASE produtos WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE produtos;
             postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3                        3079    12924    plpgsql 	   EXTENSION     ?   CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;
    DROP EXTENSION plpgsql;
                  false                       0    0    EXTENSION plpgsql    COMMENT     @   COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';
                       false    1            ?            1259    49213    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public       postgres    false    3            ?            1259    49297    product    TABLE     ?   CREATE TABLE public.product (
    id bigint NOT NULL,
    description character varying(255),
    product_name character varying(255)
);
    DROP TABLE public.product;
       public         postgres    false    3            ?            1259    49305    product_stack    TABLE     d   CREATE TABLE public.product_stack (
    product_id bigint NOT NULL,
    stack_id bigint NOT NULL
);
 !   DROP TABLE public.product_stack;
       public         postgres    false    3            ?            1259    49308    product_target_market    TABLE     t   CREATE TABLE public.product_target_market (
    product_id bigint NOT NULL,
    target_market_id bigint NOT NULL
);
 )   DROP TABLE public.product_target_market;
       public         postgres    false    3            ?            1259    49311    stack    TABLE     ^   CREATE TABLE public.stack (
    id bigint NOT NULL,
    description character varying(255)
);
    DROP TABLE public.stack;
       public         postgres    false    3            ?            1259    49316    target_market    TABLE     f   CREATE TABLE public.target_market (
    id bigint NOT NULL,
    description character varying(255)
);
 !   DROP TABLE public.target_market;
       public         postgres    false    3                      0    49297    product 
   TABLE DATA               @   COPY public.product (id, description, product_name) FROM stdin;
    public       postgres    false    197   ?                 0    49305    product_stack 
   TABLE DATA               =   COPY public.product_stack (product_id, stack_id) FROM stdin;
    public       postgres    false    198   H                 0    49308    product_target_market 
   TABLE DATA               M   COPY public.product_target_market (product_id, target_market_id) FROM stdin;
    public       postgres    false    199   ?                 0    49311    stack 
   TABLE DATA               0   COPY public.stack (id, description) FROM stdin;
    public       postgres    false    200   ?                 0    49316    target_market 
   TABLE DATA               8   COPY public.target_market (id, description) FROM stdin;
    public       postgres    false    201   M                  0    0    hibernate_sequence    SEQUENCE SET     A   SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);
            public       postgres    false    196            ?
           2606    49304    product product_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pkey;
       public         postgres    false    197            ?
           2606    49315    stack stack_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.stack
    ADD CONSTRAINT stack_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.stack DROP CONSTRAINT stack_pkey;
       public         postgres    false    200            ?
           2606    49320     target_market target_market_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.target_market
    ADD CONSTRAINT target_market_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.target_market DROP CONSTRAINT target_market_pkey;
       public         postgres    false    201            ?
           2606    49326 )   product_stack fk3dd57tbg7fj21k7upty9hl8ic    FK CONSTRAINT     ?   ALTER TABLE ONLY public.product_stack
    ADD CONSTRAINT fk3dd57tbg7fj21k7upty9hl8ic FOREIGN KEY (product_id) REFERENCES public.product(id);
 S   ALTER TABLE ONLY public.product_stack DROP CONSTRAINT fk3dd57tbg7fj21k7upty9hl8ic;
       public       postgres    false    198    197    2688            ?
           2606    49331 1   product_target_market fklhmdf9gupp5ad5dfot2sc7nr9    FK CONSTRAINT     ?   ALTER TABLE ONLY public.product_target_market
    ADD CONSTRAINT fklhmdf9gupp5ad5dfot2sc7nr9 FOREIGN KEY (target_market_id) REFERENCES public.target_market(id);
 [   ALTER TABLE ONLY public.product_target_market DROP CONSTRAINT fklhmdf9gupp5ad5dfot2sc7nr9;
       public       postgres    false    201    199    2692            ?
           2606    49336 1   product_target_market fkqd3d4yes79mxiy7aoi91j2svx    FK CONSTRAINT     ?   ALTER TABLE ONLY public.product_target_market
    ADD CONSTRAINT fkqd3d4yes79mxiy7aoi91j2svx FOREIGN KEY (product_id) REFERENCES public.product(id);
 [   ALTER TABLE ONLY public.product_target_market DROP CONSTRAINT fkqd3d4yes79mxiy7aoi91j2svx;
       public       postgres    false    2688    199    197            ?
           2606    49321 )   product_stack fkqt6vd0ff7pj1qmmnf8h7pa4m8    FK CONSTRAINT     ?   ALTER TABLE ONLY public.product_stack
    ADD CONSTRAINT fkqt6vd0ff7pj1qmmnf8h7pa4m8 FOREIGN KEY (stack_id) REFERENCES public.stack(id);
 S   ALTER TABLE ONLY public.product_stack DROP CONSTRAINT fkqt6vd0ff7pj1qmmnf8h7pa4m8;
       public       postgres    false    200    198    2690               ?   x?M???0D?q[P#z??8Cd???zM=H(č?B9?h???;?????ۧ?e???́Jw?7?.??Ob[~?(:? ??Րf?]??.??(J??|Q.?q?n?ʂ'???k?q?񳝢z???3?|?`O         .   x???  ?w\?	g/?_;<$??hHtL?o)c???R?Hz???         .   x?ƹ 0?Z&??|?d?9r?ʥ?M7o-l\?a????         y   x??K
?0?????
????ZAZ?S'??`͓&ܽ?Xi9??
K鴌1a%?7????S1}?<???û??????M???????^?L?BsL%?2??sfra+?ǀ?\?T?x. ??#         ?   x?=?=?0@??>?O????L BL,nb*WMqz"???P???94?R??\/???????=
???(?Kω^?>j!?/?	3=?50??&?qwɑ)j?ʸ???:?x??????sk\??3D?f.?     