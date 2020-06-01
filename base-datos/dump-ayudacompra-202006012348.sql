PGDMP     :    0                x            ayudacompra    12.3 (Debian 12.3-1.pgdg100+1)    12.3 8    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16384    ayudacompra    DATABASE     {   CREATE DATABASE ayudacompra WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.utf8' LC_CTYPE = 'en_US.utf8';
    DROP DATABASE ayudacompra;
                postgres    false                        2615    16388    request    SCHEMA        CREATE SCHEMA request;
    DROP SCHEMA request;
                postgres    false            �            1259    16408    address    TABLE     �  CREATE TABLE request.address (
    id_address uuid NOT NULL,
    id_user uuid NOT NULL,
    address_name character varying(250) NOT NULL,
    address_number character varying(10) NOT NULL,
    block character varying(15),
    depto character varying(15),
    county character varying(50) NOT NULL,
    city character varying(32) NOT NULL,
    province character varying(32),
    region character varying(32) NOT NULL,
    country character varying(32) NOT NULL
);
    DROP TABLE request.address;
       request         heap    postgres    false    6            �            1259    16470    comment_type    TABLE     �   CREATE TABLE request.comment_type (
    id_comment_type uuid NOT NULL,
    comment_type_name character varying(150) NOT NULL
);
 !   DROP TABLE request.comment_type;
       request         heap    postgres    false    6            �            1259    16423    help_request    TABLE     Z  CREATE TABLE request.help_request (
    id_help_request uuid NOT NULL,
    title character varying(50) NOT NULL,
    date_created date NOT NULL,
    date_expiration date,
    date_completed date,
    id_user_needy uuid NOT NULL,
    id_address uuid,
    id_comment_order uuid,
    id_user_helper uuid,
    id_help_request_status uuid NOT NULL
);
 !   DROP TABLE request.help_request;
       request         heap    postgres    false    6            �            1259    16418    help_request_status    TABLE     �   CREATE TABLE request.help_request_status (
    help_request_status_name character varying(32) NOT NULL,
    id_help_request_status uuid NOT NULL
);
 (   DROP TABLE request.help_request_status;
       request         heap    postgres    false    6            �            1259    16447    item_status    TABLE     }   CREATE TABLE request.item_status (
    item_status_name character varying(150) NOT NULL,
    id_item_status uuid NOT NULL
);
     DROP TABLE request.item_status;
       request         heap    postgres    false    6            �            1259    16452    items    TABLE     �   CREATE TABLE request.items (
    id_items uuid NOT NULL,
    quantity integer NOT NULL,
    item_name character varying(100) NOT NULL,
    id_item_status uuid NOT NULL,
    id_help_request uuid NOT NULL
);
    DROP TABLE request.items;
       request         heap    postgres    false    6            �            1259    16475    text_comments    TABLE     �   CREATE TABLE request.text_comments (
    id_comments uuid NOT NULL,
    id_comment_type uuid NOT NULL,
    content_comment character varying(150) NOT NULL
);
 "   DROP TABLE request.text_comments;
       request         heap    postgres    false    6            �            1259    16389    user_app    TABLE     �  CREATE TABLE request.user_app (
    id_user uuid NOT NULL,
    first_name character varying(100) NOT NULL,
    last_name character varying(100) NOT NULL,
    contact_number integer NOT NULL,
    user_name character varying(16) NOT NULL,
    user_password character varying(16) NOT NULL,
    user_email character varying(250) NOT NULL,
    id_user_status uuid NOT NULL,
    profile_url character varying
);
    DROP TABLE request.user_app;
       request         heap    postgres    false    6            �            1259    16392    user_status    TABLE     |   CREATE TABLE request.user_status (
    id_user_status uuid NOT NULL,
    user_status_name character varying(32) NOT NULL
);
     DROP TABLE request.user_status;
       request         heap    postgres    false    6            �            1259    16503    warning    TABLE     �   CREATE TABLE request.warning (
    id_warning uuid NOT NULL,
    id_warning_type uuid NOT NULL,
    id_user_from uuid NOT NULL,
    id_user_to uuid NOT NULL,
    id_text_comments uuid,
    id_help_request uuid NOT NULL,
    id_address_needy uuid
);
    DROP TABLE request.warning;
       request         heap    postgres    false    6            �            1259    16490    warning_type    TABLE     �   CREATE TABLE request.warning_type (
    id_warning_type uuid NOT NULL,
    warning_type_name character varying(150) NOT NULL
);
 !   DROP TABLE request.warning_type;
       request         heap    postgres    false    6            �          0    16408    address 
   TABLE DATA           �   COPY request.address (id_address, id_user, address_name, address_number, block, depto, county, city, province, region, country) FROM stdin;
    request          postgres    false    206            �          0    16470    comment_type 
   TABLE DATA           K   COPY request.comment_type (id_comment_type, comment_type_name) FROM stdin;
    request          postgres    false    211            �          0    16423    help_request 
   TABLE DATA           �   COPY request.help_request (id_help_request, title, date_created, date_expiration, date_completed, id_user_needy, id_address, id_comment_order, id_user_helper, id_help_request_status) FROM stdin;
    request          postgres    false    208            �          0    16418    help_request_status 
   TABLE DATA           `   COPY request.help_request_status (help_request_status_name, id_help_request_status) FROM stdin;
    request          postgres    false    207            �          0    16447    item_status 
   TABLE DATA           H   COPY request.item_status (item_status_name, id_item_status) FROM stdin;
    request          postgres    false    209            �          0    16452    items 
   TABLE DATA           `   COPY request.items (id_items, quantity, item_name, id_item_status, id_help_request) FROM stdin;
    request          postgres    false    210            �          0    16475    text_comments 
   TABLE DATA           W   COPY request.text_comments (id_comments, id_comment_type, content_comment) FROM stdin;
    request          postgres    false    212            �          0    16389    user_app 
   TABLE DATA           �   COPY request.user_app (id_user, first_name, last_name, contact_number, user_name, user_password, user_email, id_user_status, profile_url) FROM stdin;
    request          postgres    false    204            �          0    16392    user_status 
   TABLE DATA           H   COPY request.user_status (id_user_status, user_status_name) FROM stdin;
    request          postgres    false    205            �          0    16503    warning 
   TABLE DATA           �   COPY request.warning (id_warning, id_warning_type, id_user_from, id_user_to, id_text_comments, id_help_request, id_address_needy) FROM stdin;
    request          postgres    false    214            �          0    16490    warning_type 
   TABLE DATA           K   COPY request.warning_type (id_warning_type, warning_type_name) FROM stdin;
    request          postgres    false    213                       2606    16412    address address_pk 
   CONSTRAINT     Y   ALTER TABLE ONLY request.address
    ADD CONSTRAINT address_pk PRIMARY KEY (id_address);
 =   ALTER TABLE ONLY request.address DROP CONSTRAINT address_pk;
       request            postgres    false    206                       2606    16479    text_comments comments_pk 
   CONSTRAINT     a   ALTER TABLE ONLY request.text_comments
    ADD CONSTRAINT comments_pk PRIMARY KEY (id_comments);
 D   ALTER TABLE ONLY request.text_comments DROP CONSTRAINT comments_pk;
       request            postgres    false    212                       2606    16431    help_request helprequest_pk 
   CONSTRAINT     g   ALTER TABLE ONLY request.help_request
    ADD CONSTRAINT helprequest_pk PRIMARY KEY (id_help_request);
 F   ALTER TABLE ONLY request.help_request DROP CONSTRAINT helprequest_pk;
       request            postgres    false    208                       2606    16429 (   help_request_status helprequeststatus_pk 
   CONSTRAINT     {   ALTER TABLE ONLY request.help_request_status
    ADD CONSTRAINT helprequeststatus_pk PRIMARY KEY (id_help_request_status);
 S   ALTER TABLE ONLY request.help_request_status DROP CONSTRAINT helprequeststatus_pk;
       request            postgres    false    207                       2606    16459    items items_pk 
   CONSTRAINT     S   ALTER TABLE ONLY request.items
    ADD CONSTRAINT items_pk PRIMARY KEY (id_items);
 9   ALTER TABLE ONLY request.items DROP CONSTRAINT items_pk;
       request            postgres    false    210                       2606    16451    item_status itemstatus_pk 
   CONSTRAINT     d   ALTER TABLE ONLY request.item_status
    ADD CONSTRAINT itemstatus_pk PRIMARY KEY (id_item_status);
 D   ALTER TABLE ONLY request.item_status DROP CONSTRAINT itemstatus_pk;
       request            postgres    false    209                       2606    16474    comment_type typecomment_pk 
   CONSTRAINT     g   ALTER TABLE ONLY request.comment_type
    ADD CONSTRAINT typecomment_pk PRIMARY KEY (id_comment_type);
 F   ALTER TABLE ONLY request.comment_type DROP CONSTRAINT typecomment_pk;
       request            postgres    false    211                       2606    16534    warning_type typewarning_pk 
   CONSTRAINT     g   ALTER TABLE ONLY request.warning_type
    ADD CONSTRAINT typewarning_pk PRIMARY KEY (id_warning_type);
 F   ALTER TABLE ONLY request.warning_type DROP CONSTRAINT typewarning_pk;
       request            postgres    false    213                       2606    16402    user_app user_pk 
   CONSTRAINT     T   ALTER TABLE ONLY request.user_app
    ADD CONSTRAINT user_pk PRIMARY KEY (id_user);
 ;   ALTER TABLE ONLY request.user_app DROP CONSTRAINT user_pk;
       request            postgres    false    204                       2606    16400    user_app user_un 
   CONSTRAINT     O   ALTER TABLE ONLY request.user_app
    ADD CONSTRAINT user_un UNIQUE (id_user);
 ;   ALTER TABLE ONLY request.user_app DROP CONSTRAINT user_un;
       request            postgres    false    204            	           2606    16398    user_status userstatus_pk 
   CONSTRAINT     d   ALTER TABLE ONLY request.user_status
    ADD CONSTRAINT userstatus_pk PRIMARY KEY (id_user_status);
 D   ALTER TABLE ONLY request.user_status DROP CONSTRAINT userstatus_pk;
       request            postgres    false    205                       2606    16396    user_status userstatus_un 
   CONSTRAINT     _   ALTER TABLE ONLY request.user_status
    ADD CONSTRAINT userstatus_un UNIQUE (id_user_status);
 D   ALTER TABLE ONLY request.user_status DROP CONSTRAINT userstatus_un;
       request            postgres    false    205                       2606    16507    warning warning_pk 
   CONSTRAINT     Y   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_pk PRIMARY KEY (id_warning);
 =   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_pk;
       request            postgres    false    214                       2606    16549    address address_fk    FK CONSTRAINT     �   ALTER TABLE ONLY request.address
    ADD CONSTRAINT address_fk FOREIGN KEY (id_user) REFERENCES request.user_app(id_user) ON UPDATE CASCADE ON DELETE CASCADE;
 =   ALTER TABLE ONLY request.address DROP CONSTRAINT address_fk;
       request          postgres    false    204    206    2823            '           2606    16480    text_comments comments_fk    FK CONSTRAINT     �   ALTER TABLE ONLY request.text_comments
    ADD CONSTRAINT comments_fk FOREIGN KEY (id_comment_type) REFERENCES request.comment_type(id_comment_type) ON UPDATE CASCADE ON DELETE CASCADE;
 D   ALTER TABLE ONLY request.text_comments DROP CONSTRAINT comments_fk;
       request          postgres    false    2839    211    212                        2606    16432    help_request helprequest_fk    FK CONSTRAINT     �   ALTER TABLE ONLY request.help_request
    ADD CONSTRAINT helprequest_fk FOREIGN KEY (id_user_needy) REFERENCES request.user_app(id_user) ON UPDATE CASCADE ON DELETE CASCADE;
 F   ALTER TABLE ONLY request.help_request DROP CONSTRAINT helprequest_fk;
       request          postgres    false    204    208    2823            !           2606    16437    help_request helprequest_fk_1    FK CONSTRAINT     �   ALTER TABLE ONLY request.help_request
    ADD CONSTRAINT helprequest_fk_1 FOREIGN KEY (id_user_helper) REFERENCES request.user_app(id_user) ON UPDATE CASCADE ON DELETE CASCADE;
 H   ALTER TABLE ONLY request.help_request DROP CONSTRAINT helprequest_fk_1;
       request          postgres    false    208    2823    204            "           2606    16442    help_request helprequest_fk_2    FK CONSTRAINT     �   ALTER TABLE ONLY request.help_request
    ADD CONSTRAINT helprequest_fk_2 FOREIGN KEY (id_address) REFERENCES request.address(id_address) ON UPDATE CASCADE ON DELETE CASCADE;
 H   ALTER TABLE ONLY request.help_request DROP CONSTRAINT helprequest_fk_2;
       request          postgres    false    2829    206    208            #           2606    16485    help_request helprequest_fk_3    FK CONSTRAINT     �   ALTER TABLE ONLY request.help_request
    ADD CONSTRAINT helprequest_fk_3 FOREIGN KEY (id_comment_order) REFERENCES request.text_comments(id_comments) ON UPDATE CASCADE ON DELETE CASCADE;
 H   ALTER TABLE ONLY request.help_request DROP CONSTRAINT helprequest_fk_3;
       request          postgres    false    2841    208    212            $           2606    16544    help_request helprequest_fk_4    FK CONSTRAINT     �   ALTER TABLE ONLY request.help_request
    ADD CONSTRAINT helprequest_fk_4 FOREIGN KEY (id_help_request_status) REFERENCES request.help_request_status(id_help_request_status) ON UPDATE CASCADE ON DELETE CASCADE;
 H   ALTER TABLE ONLY request.help_request DROP CONSTRAINT helprequest_fk_4;
       request          postgres    false    207    208    2831            %           2606    16460    items items_fk    FK CONSTRAINT     �   ALTER TABLE ONLY request.items
    ADD CONSTRAINT items_fk FOREIGN KEY (id_item_status) REFERENCES request.item_status(id_item_status) ON UPDATE CASCADE ON DELETE CASCADE;
 9   ALTER TABLE ONLY request.items DROP CONSTRAINT items_fk;
       request          postgres    false    209    210    2835            &           2606    16554    items items_fk_1    FK CONSTRAINT     �   ALTER TABLE ONLY request.items
    ADD CONSTRAINT items_fk_1 FOREIGN KEY (id_help_request) REFERENCES request.help_request(id_help_request) ON UPDATE CASCADE ON DELETE CASCADE;
 ;   ALTER TABLE ONLY request.items DROP CONSTRAINT items_fk_1;
       request          postgres    false    2833    208    210                       2606    16403    user_app user_fk    FK CONSTRAINT     �   ALTER TABLE ONLY request.user_app
    ADD CONSTRAINT user_fk FOREIGN KEY (id_user_status) REFERENCES request.user_status(id_user_status) ON UPDATE CASCADE ON DELETE CASCADE;
 ;   ALTER TABLE ONLY request.user_app DROP CONSTRAINT user_fk;
       request          postgres    false    204    205    2827            -           2606    16539    warning warning_fk    FK CONSTRAINT     �   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_fk FOREIGN KEY (id_warning_type) REFERENCES request.warning_type(id_warning_type) ON UPDATE CASCADE ON DELETE CASCADE;
 =   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_fk;
       request          postgres    false    2843    214    213            (           2606    16508    warning warning_fk_1    FK CONSTRAINT     �   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_fk_1 FOREIGN KEY (id_user_from) REFERENCES request.user_app(id_user) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_fk_1;
       request          postgres    false    214    204    2823            )           2606    16513    warning warning_fk_2    FK CONSTRAINT     �   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_fk_2 FOREIGN KEY (id_user_to) REFERENCES request.user_app(id_user) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_fk_2;
       request          postgres    false    204    2823    214            *           2606    16518    warning warning_fk_3    FK CONSTRAINT     �   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_fk_3 FOREIGN KEY (id_text_comments) REFERENCES request.text_comments(id_comments) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_fk_3;
       request          postgres    false    212    214    2841            +           2606    16523    warning warning_fk_4    FK CONSTRAINT     �   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_fk_4 FOREIGN KEY (id_help_request) REFERENCES request.help_request(id_help_request) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_fk_4;
       request          postgres    false    208    2833    214            ,           2606    16528    warning warning_fk_5    FK CONSTRAINT     �   ALTER TABLE ONLY request.warning
    ADD CONSTRAINT warning_fk_5 FOREIGN KEY (id_address_needy) REFERENCES request.address(id_address) ON UPDATE CASCADE ON DELETE CASCADE;
 ?   ALTER TABLE ONLY request.warning DROP CONSTRAINT warning_fk_5;
       request          postgres    false    206    2829    214            �   3  x�u��j1���S�����c���^�bR=�2�7�.��C��gȋU��i
),�V���~����
8���Q���*%M6yk�%�HZm�vB�P�W/������r�~x���������|�i����V�ӏ�p}eVw��.J(6zH�8@	����bKs*��K�ꢀ��c�Pt )�VD�Z�>~���������f���yw������[���ڞ�6n�8�)��6�x��	�p��Ab���3P*��/Y��b8���oOS��z�a�g��i��������r��Q�{��H�CR��5���5�0X��	���GR5�̂D�ؖ,�*=��l����OW,��cS�|��W�Jw���8m�"3$':�I�����sl�HmC
%t?y!��V_�T����Zsi��f�n����} E"��s Ӹ�@է�똛���W�4�9���b��V���3��n�����7�YM;���5���(���,�6Wfv��#vB���
.̹�<OH��VG6
�|�iŇ���<!�uD��j�kz|���r�X�S��      �   i   x�=�;�0�:>�gK�ԹMG1E���ӱ�b�UW�W#Q+�"0�|6F�ӭ}�������S�^�A�"$��
�D0�f�ئ��՟�t�:�~ZQo      �   �  x���=n1��}��H"ER�0H7"E.b�y�7���f\r��(R+n�hJ��a"��%�Ƿ���u����C�����V�݆�w�\�k���\|j�}�R6#��y�����`˥����7y벀sCA�NU�>�T�<����E@GA�@��;A�ٔ�z����bMX�Ȼ�,�������9�?��s=���z2�g
1�F�S�I���Ϣ�m�8����R��X`��Z����M���43ph��/�!K!gx��<�S��B��x�J`�Ӂ�pĲ�U���xy�������!�7�c1m��\S2�AT�A�dh���[�
�$	�����������ĘȰ��h���W����~��}^�k�U�Ҙؠ�T��.�	t�:J�G��1�dI%K��NE֘Q�&Y��:�f#]W
�l��\�,5�{X�#1�>���j�2	Z�s�r��|�\~���q      �   �   x�λN1@�z�/Fq���n�%���0b5Z���3��ѽ=�ܦUjq�P0Y
ܜs���_)ɰ�`0�(�@G_�X���[�����mԱ���cT À� 3v����-�_���6{��A6��n����db层��q�_���;��j�_']�s'��MIp���RJ���<�      �   �   x��91 ��+��Q��9Z�(y�;	�6��'Pό4��Xu1�$lFO���XW(��8{�\�}�O�����݃T � -�@Q5&$$rW{�n���y�D%�)���l�6��	�������g�<��CJ�±��0|!JA�=�ι/�&1S      �   �  x�����9E��W���$�Џ�3��י m�z�cIS����D�L���nq��L�)�<gT��è0j��.qʒ�o���i��ox]�t8�b���	b���@+���4CC�Iˢ14eP�(e��9@�ɐ��Rڮ�So"���%M�5L4B�]ؖ���߼Wۿ��s;m�;$)c���N@
NPؼH�9@����|��փ�{ѻ��Z,�����ˌc$�D�ú��3�g{�9 !#��b,U�M�j�B{i0Ds��*'�L��8
�.9����V+s�>�h�N�Pq	�h�*.�������fnh�e���eu��R�b<J�����X��z����0��;��z=ɵPEFC�����4��N۴�v[b�n%L�ET�a�E��\Q��KF�����/��6-c�W���*ۯm��u�˫;(���I:CݩL�Bh5p�C����pz��/�{Ǘ[��&����
�6s��o���~���,�|�?�v��38��\�Bɋ|���f����5-�7�����B<K�>"B���3� �9�7K��w�����)h�ޫ�_�#Fn4{{2RPz��'����O;d���nCV�۽��E���¹Ö}m�3@�^�!x6d�������#�]��n�[�x������ߠ      �   �   x��1N�0 ��� �d;kǮ� �4��"����;�'QP��1B;iF&�ǂ��4h���H!O)��-�}��cA�0���0.���н�Ra�6�\��*�y ��BQ�}),6]�.��m,���۩'3:V�d.H�	���RB��;�S���#���D�=&�FTk��C+F��zY���k�~T��O>B�A�@��/��6_�1��̵?�}���Q      �   c  x����n1�Ϟ���q{7�Ɏ�!$ʅK�.ϴ�˨� yz��Lā[�U�?��E-�t�F9�,I�d�;�yH>��M�ԑ��BS�"�TZj�I��OGw�i��v�@U�k�eBx����J��21a��*M��x>��TE��~.<��01�����6<X�Kh�1�|��35:["=2r9諎\a�B�p��b�����Iq�}un�����(LP�#P�R�W�P6Di%������=�dQZP����nr;��K��	`�x�y_c��p��r������	0��o�9�X���.����`��2_UabTzéAQ��5�;���0����Wi�v\HSBhMp�Y�Ja��9i
0�� �ǻr�Z��!h*�CjEB�&% ���@��p�}~t˘�B�dCWG�]��_�9�8�Y��0�U�P�A����ۇ4yfy�*��ʒey *T��<��9�vS�9�����sY��N��%��¢�֊�o��fFN��蔧\�|Z��>锹5p�K��/��ϯ�Fx\���ҁ�&7�f�L�ޗ�� H��ͨ��1�@�c�"}�o�@�c���������p���(6���+p\      �   s   x�-�;! �z��#�0G���`Ki���?��i�9�ut����P�VF�Pi����%��$7�<���͐�������zL���`�e���!�AM�b�ʨ��ޱ��QJ�|�%�      �   �   x��ɑ1���\��$1���?���K%�#i�A�u`���@X�yb�0_��&�z!����b��"tc?�`.���Ϊ�+#����AiS����v�v�����Q��ـq
8�����Ą(�G�R�K��	��B��tޢcG���~����<���:s      �   h   x�M�1�0 ���0�c'u~Љ���ql��*ԍ߳r�1s�,��6E-�8�C�R�dj����x�e_n�֥{wF..�dǬy�fMt�Di��'Nx\��}     