Identified Issues:


Login endpoint always returned 401 Unauthorized even for valid credentials.
Spring Security was not configured to allow unauthenticated access to /api/auth/login.
Password encoding mismatch between stored password and authentication logic.
Fixes Applied:


Updated Spring Security configuration to permit access to /api/auth/login without authentication.
Ensured the sample user (test@example.com / password123) is seeded with the correct password encoding.
Adjusted authentication logic to return 200 OK with a dummy JWT token for valid credentials and 401 Unauthorized for invalid ones.
Improvements or Suggestions (optional):
Improved error handling and response messages for failed authentication.
