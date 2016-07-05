package org.everit.jira.configuration.plugin.schema.qdsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPublicHoliday is a Querydsl query type for QPublicHoliday
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPublicHoliday extends com.querydsl.sql.RelationalPathBase<QPublicHoliday> {

    private static final long serialVersionUID = -530108431;

    public static final QPublicHoliday publicHoliday = new QPublicHoliday("everit_jira_public_holiday");

    public class PrimaryKeys {

        public final com.querydsl.sql.PrimaryKey<QPublicHoliday> publicHolidayPK = createPrimaryKey(publicHolidayId);

    }

    public class ForeignKeys {

        public final com.querydsl.sql.ForeignKey<QHolidayScheme> holidaySchemeFK = createForeignKey(holidaySchemeId, "holiday_scheme_id");

    }

    public final DatePath<java.sql.Date> date_ = createDate("date_", java.sql.Date.class);

    public final StringPath description_ = createString("description_");

    public final NumberPath<Long> holidaySchemeId = createNumber("holidaySchemeId", Long.class);

    public final NumberPath<Long> publicHolidayId = createNumber("publicHolidayId", Long.class);

    public final PrimaryKeys pk = new PrimaryKeys();

    public final ForeignKeys fk = new ForeignKeys();

    public QPublicHoliday(String variable) {
        super(QPublicHoliday.class, forVariable(variable), "public", "everit_jira_public_holiday");
        addMetadata();
    }

    public QPublicHoliday(String variable, String schema, String table) {
        super(QPublicHoliday.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPublicHoliday(Path<? extends QPublicHoliday> path) {
        super(path.getType(), path.getMetadata(), "public", "everit_jira_public_holiday");
        addMetadata();
    }

    public QPublicHoliday(PathMetadata metadata) {
        super(QPublicHoliday.class, metadata, "public", "everit_jira_public_holiday");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(date_, ColumnMetadata.named("date_").withIndex(3).ofType(Types.DATE).withSize(8).notNull());
        addMetadata(description_, ColumnMetadata.named("description_").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(holidaySchemeId, ColumnMetadata.named("holiday_scheme_id").withIndex(2).ofType(Types.BIGINT).withSize(19));
        addMetadata(publicHolidayId, ColumnMetadata.named("public_holiday_id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
    }

}

