package org.apache.hadoop.metadata;

import javax.inject.Inject;

import junit.framework.Assert;

import org.apache.hadoop.metadata.repository.graph.GraphService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

/**
 * Unit test for Guice injector service loading
 * 
 * Uses TestNG's Guice annotation to load the necessary modules and inject the
 * objects from Guice
 */
@Guice(modules = RepositoryMetadataModule.class)
public class RepositoryServiceLoadingTest {

	@Inject
	GraphService gs;

	@BeforeClass
	public void setUp() throws Exception {
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetGraphService() throws Exception {
		Assert.assertNotNull(gs);
	}
}
