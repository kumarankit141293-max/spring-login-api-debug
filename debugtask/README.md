# Debug Task – Spring Boot Login API

## Objective

You are provided with a basic Spring Boot application containing a login endpoint at `/api/auth/login`. The endpoint is intended to authenticate users based on email and password. However, all login attempts currently result in a `401 Unauthorized` response, even when valid credentials are used.

Your task is to:

- Identify and resolve the issue(s) preventing successful authentication.
- Ensure that valid login attempts return a `200 OK` response along with a dummy JWT token.
- Ensure invalid login attempts return a proper `401 Unauthorized` response.
- Optionally improve the overall code quality, structure, or error handling where appropriate.

## Task Instructions

1. Clone or extract the provided project and open it in your preferred IDE.
2. Run the application using the standard Spring Boot method.
3. Attempt a login request using tools such as Postman or curl.
4. Diagnose why the authentication flow is not working as expected.
5. Fix the issues and test for the following:
   - Valid credentials return HTTP 200 with a sample JWT token.
   - Invalid credentials return HTTP 401 Unauthorized.
6. Keep the JWT logic simple—return a static token or placeholder string.

## Sample Credentials

Use the following sample user credentials (you may seed this user manually in memory or via data.sql):

Email: test@example.com  
Password: password123

Note: Ensure that the password is stored in a way that aligns with how Spring Security expects to verify it (e.g., password encoding if applicable).

## Evaluation Criteria

- Ability to identify and resolve issues related to authentication and configuration.
- Understanding of Spring Security concepts and correct usage.
- Clarity, readability, and maintainability of code changes.
- Appropriate use of HTTP status codes and request/response patterns.
- Optional: Suggestions or implementation of code improvements.

## Submission Instructions

- Submit the modified project as a ZIP file or via a public Git repository link.
- Include a brief section in this README file under **"Fix Summary"** explaining:
  - What issues were identified
  - What changes were made to fix them
  - Any improvements or recommendations made beyond the fix

## Fix Summary (to be filled by the candidate)

- Identified Issues:
  - ...

- Fixes Applied:
  - ...

- Improvements or Suggestions (optional):
  - ...
