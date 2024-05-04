package com.fourdev.wshopbackend.infra.sql.postgres.empresa

/**
 * @author stevenreis
 * @since 1.0 (03/05/24)
 */
class EmpresaSelectSql {

    public static final String select_all_empresa = """
    
        select
            e.id_empresa,
            e.ds_nome_fantasia,
            e.ds_razao_social
        from public.empresa e

    """
}
