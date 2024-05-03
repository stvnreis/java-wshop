package com.fourdev.wshopbackend.endpoint.produto.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourdev.wshopbackend.domain.produto.Produto;
import com.fourdev.wshopbackend.dto.ProdutoDto;
import com.fourdev.wshopbackend.endpoint.AbstractEndpoint;

/**
 * @author stevenreis
 * @since 1.0 (02/05/24)
 */
@RestController
@RequestMapping("produto")
public class ProdutoEndpoint extends AbstractEndpoint<Produto, ProdutoDto> {

}
