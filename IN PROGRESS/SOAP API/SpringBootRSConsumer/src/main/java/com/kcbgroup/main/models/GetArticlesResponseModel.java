package com.kcbgroup.main.models;

import com.kcbgroup.main.model.wsdl.ArticleInfo;
import lombok.Data;

import java.util.List;

@Data
public class GetAllArticlesResponseModel {
    private List<ArticleInfo>  articleInfo;
}
