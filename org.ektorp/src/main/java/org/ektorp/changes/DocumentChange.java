package org.ektorp.changes;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

/**
 * Represents a document change within a database.
 * @author henrik lundgren
 *
 */
public interface DocumentChange {
	/**
	 * @return the database sequence number in which this change took place.
	 */
	int getSequence();
	/**
	 * @return the database string format sequence number in which this change took place (e.g. Cloudant).
	 */
	String getStringSequence();
	/**
	 *
	 * @return the id of the changed document.
	 */
	String getId();
	/**
	 *
	 * @return the revision the document had at the time of change.
	 */
	String getRevision();

    /**
     *
     * @return the collection of revisions, including conflicts
     * @since 1.4.0
     */
    public List<String> getRevisions();

	/**
	 *
	 * @return true if the changed document has been deleted.
	 */
	boolean isDeleted();
	/**
	 * If the feed has been setup to include docs, it will be available through this accessor.
	 * @return
	 */
	String getDoc();
	/**
	 * If the feed has been setup to include docs, it will be available through this accessor.
	 * @return
	 */
	JsonNode getDocAsNode();

}