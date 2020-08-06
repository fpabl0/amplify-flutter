/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */


package com.amazonaws.amplify.amplify_auth_cognito.types

enum class FlutterAuthFailureMessage {
  SIGNUP {
    override fun toString(): String {
      return "AMPLIFY_SIGNUP_FAILED"
    }
  },
  CASTING {
    override fun toString(): String {
      return "ERROR_CASTING_INPUT_IN_PLATFORM_CODE"
    }
  },
  CONFIRM_SIGNUP {
    override fun toString(): String {
      return "AMPLIFY_CONFIRM_SIGNUP_FAILED"
    }
  },
  SIGNIN {
    override fun toString(): String {
      return "AMPLIFY_SIGNIN_FAILED"
    }
  },
  CONFIRM_SIGNIN {
    override fun toString(): String {
      return "AMPLIFY_CONFIRM_SIGNIN_FAILED"
    }
  },
  SIGNOUT {
    override fun toString(): String {
      return "AMPLIFY_SIGNOUT_FAILED"
    }
  },
  MALFORMED {
    override fun toString(): String {
      return "AMPLIFY_REQUEST_MALFORMED"
    }
  }
}