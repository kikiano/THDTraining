package com.sample.demo.data;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.google.cloud.spanner.Key;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import com.sample.demo.models.Guide;

@RepositoryRestResource
public interface GuideRepository extends SpannerRepository<Guide, Key>{

}
