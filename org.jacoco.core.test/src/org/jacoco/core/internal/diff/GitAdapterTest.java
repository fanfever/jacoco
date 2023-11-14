package org.jacoco.core.internal.diff;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.junit.Test;

import java.io.IOException;

public class GitAdapterTest {

	@Test
	public void should_not_capture_frame_when_no_frame_is_defined()
			throws GitAPIException, IOException {
		GitAdapter gitAdapter = new GitAdapter(
				"/Users/fanfever/Documents/develop/code/git/udesk_cs_ts");
		Git git = gitAdapter.getGit();
	}
}
