package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShieldOne: ImageVector
    get() {
        if (_ShieldOne != null) {
            return _ShieldOne!!
        }
        _ShieldOne = ImageVector.Builder(
            name = "Filled.ShieldOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.226f, 2.49f)
                arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.548f, 0f)
                lineToRelative(0.61f, 0.417f)
                arcToRelative(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.235f, 1.92f)
                arcToRelative(1.264f, 1.264f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.131f, 1.26f)
                verticalLineToRelative(4.93f)
                curveToRelative(0f, 1.604f, -0.532f, 3.112f, -1.28f, 4.443f)
                curveToRelative(-1.617f, 2.88f, -4.344f, 5.104f, -5.485f, 5.96f)
                curveToRelative(-0.588f, 0.44f, -1.382f, 0.44f, -1.97f, 0f)
                curveToRelative(-1.141f, -0.856f, -3.868f, -3.08f, -5.486f, -5.96f)
                curveToRelative(-0.747f, -1.33f, -1.279f, -2.839f, -1.279f, -4.442f)
                verticalLineToRelative(-4.93f)
                curveToRelative(0f, -0.64f, 0.478f, -1.195f, 1.131f, -1.262f)
                curveToRelative(1.872f, -0.19f, 3.67f, -0.85f, 5.234f, -1.919f)
                close()
                moveTo(12f, 3.777f)
                lineToRelative(-0.538f, 0.368f)
                arcToRelative(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.712f, 2.15f)
                verticalLineToRelative(4.723f)
                curveToRelative(0f, 1.008f, 0.266f, 2.006f, 0.708f, 2.966f)
                lineToRelative(4.545f, -3.184f)
                curveToRelative(0.6f, -0.42f, 1.394f, -0.42f, 1.994f, 0f)
                lineToRelative(4.545f, 3.184f)
                curveToRelative(0.442f, -0.96f, 0.708f, -1.958f, 0.708f, -2.966f)
                verticalLineTo(6.295f)
                arcToRelative(12.8f, 12.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.712f, -2.15f)
                close()
            }
        }.build()

        return _ShieldOne!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldOne: ImageVector? = null
