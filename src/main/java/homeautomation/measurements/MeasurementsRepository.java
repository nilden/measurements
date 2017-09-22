package homeautomation.measurements;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;

@RepositoryRestResource(collectionResourceRel = "measurement", path = "measurement")
public interface MeasurementsRepository extends MongoRepository<Measurement, Date> {

}
