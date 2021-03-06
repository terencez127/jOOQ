/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sessions extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord> {

	private static final long serialVersionUID = -472469746;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.SESSIONS</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Sessions SESSIONS = new org.jooq.example.gradle.db.information_schema.tables.Sessions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord, java.lang.String> USER_NAME = createField("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord, java.lang.String> SESSION_START = createField("SESSION_START", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord, java.lang.String> STATEMENT = createField("STATEMENT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord, java.lang.String> STATEMENT_START = createField("STATEMENT_START", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord, java.lang.String> CONTAINS_UNCOMMITTED = createField("CONTAINS_UNCOMMITTED", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
	 */
	public Sessions() {
		this("SESSIONS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
	 */
	public Sessions(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Sessions.SESSIONS);
	}

	private Sessions(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Sessions(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.SessionsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Sessions as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Sessions(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Sessions rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Sessions(name, null);
	}
}
