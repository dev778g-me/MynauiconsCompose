package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Film: ImageVector
    get() {
        if (_Film != null) {
            return _Film!!
        }
        _Film = ImageVector.Builder(
            name = "Filled.Film",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.943f, 2.25f)
                horizontalLineToRelative(0.114f)
                curveToRelative(2.073f, 0f, 3.705f, 0f, 4.98f, 0.171f)
                curveToRelative(1.31f, 0.176f, 2.354f, 0.545f, 3.175f, 1.367f)
                curveToRelative(0.822f, 0.821f, 1.19f, 1.866f, 1.367f, 3.174f)
                lineToRelative(0.033f, 0.271f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.033f, 0.334f)
                curveToRelative(0.105f, 1.175f, 0.105f, 2.617f, 0.105f, 4.376f)
                verticalLineToRelative(0.114f)
                curveToRelative(0f, 1.744f, 0f, 3.177f, -0.102f, 4.347f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.027f, 0.28f)
                quadToRelative(-0.02f, 0.18f, -0.042f, 0.354f)
                curveToRelative(-0.176f, 1.308f, -0.545f, 2.353f, -1.367f, 3.174f)
                curveToRelative(-0.821f, 0.822f, -1.866f, 1.19f, -3.174f, 1.367f)
                curveToRelative(-1.276f, 0.171f, -2.908f, 0.171f, -4.981f, 0.171f)
                horizontalLineToRelative(-0.114f)
                curveToRelative(-2.073f, 0f, -3.705f, 0f, -4.98f, -0.171f)
                curveToRelative(-1.31f, -0.176f, -2.354f, -0.545f, -3.175f, -1.367f)
                curveToRelative(-0.822f, -0.821f, -1.19f, -1.866f, -1.367f, -3.174f)
                curveToRelative(-0.171f, -1.276f, -0.171f, -2.908f, -0.171f, -4.981f)
                verticalLineToRelative(-0.114f)
                curveToRelative(0f, -2.073f, 0f, -3.705f, 0.171f, -4.98f)
                curveToRelative(0.176f, -1.31f, 0.545f, -2.354f, 1.367f, -3.175f)
                curveToRelative(0.821f, -0.822f, 1.866f, -1.19f, 3.174f, -1.367f)
                curveToRelative(1.276f, -0.171f, 2.908f, -0.171f, 4.981f, -0.171f)
                moveToRelative(8.25f, 13.473f)
                curveToRelative(0.047f, -0.823f, 0.055f, -1.797f, 0.057f, -2.973f)
                horizontalLineToRelative(-3.1f)
                verticalLineToRelative(2.973f)
                close()
                moveTo(17.151f, 17.223f)
                verticalLineToRelative(2.821f)
                curveToRelative(0.956f, -0.163f, 1.551f, -0.443f, 2f, -0.892f)
                curveToRelative(0.439f, -0.438f, 0.716f, -1.015f, 0.88f, -1.929f)
                close()
                moveTo(6.651f, 20.008f)
                verticalLineToRelative(-2.785f)
                lineTo(3.968f, 17.223f)
                curveToRelative(0.165f, 0.914f, 0.442f, 1.49f, 0.88f, 1.929f)
                curveToRelative(0.418f, 0.417f, 0.961f, 0.689f, 1.803f, 0.856f)
                moveToRelative(-2.844f, -4.285f)
                horizontalLineToRelative(2.844f)
                lineTo(6.651f, 12.75f)
                horizontalLineToRelative(-2.9f)
                curveToRelative(0f, 1.176f, 0.01f, 2.15f, 0.056f, 2.973f)
                moveTo(3.75f, 11.25f)
                horizontalLineToRelative(2.9f)
                lineTo(6.65f, 8.223f)
                lineTo(3.81f, 8.223f)
                curveToRelative(-0.05f, 0.834f, -0.058f, 1.825f, -0.06f, 3.027f)
                moveToRelative(0.228f, -4.527f)
                horizontalLineToRelative(2.673f)
                verticalLineToRelative(-2.73f)
                curveToRelative(-0.842f, 0.166f, -1.385f, 0.438f, -1.803f, 0.855f)
                curveToRelative(-0.429f, 0.43f, -0.704f, 0.992f, -0.87f, 1.875f)
                moveToRelative(13.173f, -2.767f)
                verticalLineToRelative(2.767f)
                horizontalLineToRelative(2.87f)
                curveToRelative(-0.165f, -0.883f, -0.44f, -1.445f, -0.87f, -1.875f)
                curveToRelative(-0.449f, -0.449f, -1.044f, -0.73f, -2f, -0.892f)
                moveToRelative(3.039f, 4.267f)
                horizontalLineToRelative(-3.04f)
                verticalLineToRelative(3.027f)
                horizontalLineToRelative(3.1f)
                curveToRelative(-0.002f, -1.202f, -0.01f, -2.193f, -0.06f, -3.027f)
            }
        }.build()

        return _Film!!
    }

@Suppress("ObjectPropertyName")
private var _Film: ImageVector? = null
