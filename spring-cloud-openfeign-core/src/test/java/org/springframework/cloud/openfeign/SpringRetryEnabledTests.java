/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.openfeign;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.BeansException;
import org.springframework.cloud.client.loadbalancer.LoadBalancerAutoConfiguration;
import org.springframework.cloud.commons.httpclient.HttpClientConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ryan Baxter
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		classes = { LoadBalancerAutoConfiguration.class, HttpClientConfiguration.class })
public class SpringRetryEnabledTests implements ApplicationContextAware {

	private ApplicationContext context;

	@Test
	public void testLoadBalancedRetryFactoryBean() throws Exception {
		// FIXME: 3.0.0
		/*
		 * Map<String, CachingSpringLoadBalancerFactory> lbFactorys = this.context
		 * .getBeansOfType(CachingSpringLoadBalancerFactory.class);
		 * assertThat(lbFactorys.values()).hasSize(1); FeignLoadBalancer lb =
		 * lbFactorys.values().iterator().next().create("foo");
		 * assertThat(lb).isInstanceOf(RetryableFeignLoadBalancer.class);
		 */
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

}
