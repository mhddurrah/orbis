package io.project.app.repositories;

import io.project.app.domain.User;
import java.util.Optional;
import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author armena
 */
@Component
@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
    

}
