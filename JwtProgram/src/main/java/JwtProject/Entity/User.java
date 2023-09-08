package JwtProject.Entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String UseeId;
    private String UserName;
    private String UserEmail;
}
