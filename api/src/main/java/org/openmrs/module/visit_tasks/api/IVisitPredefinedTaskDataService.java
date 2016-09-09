package org.openmrs.module.visit_tasks.api;

import org.openmrs.module.openhmis.commons.api.entity.IMetadataDataService;
import org.openmrs.module.visit_tasks.api.model.VisitPredefinedTask;
import org.springframework.transaction.annotation.Transactional;

/**
 * Interface that represents classes which perform data operations for {@link VisitPredefinedTask}s.
 */
@Transactional
public interface IVisitPredefinedTaskDataService extends IMetadataDataService<VisitPredefinedTask> {

}