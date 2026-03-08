package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Chat: ImageVector
    get() {
        if (_Chat != null) {
            return _Chat!!
        }
        _Chat = ImageVector.Builder(
            name = "Filled.Chat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2.25f)
                arcTo(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 12f)
                curveToRelative(0f, 1.558f, 0.366f, 3.033f, 1.018f, 4.342f)
                curveToRelative(0.104f, 0.21f, 0.114f, 0.523f, -0.005f, 1.01f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 0.729f)
                lineToRelative(-0.03f, 0.086f)
                curveToRelative(-0.074f, 0.22f, -0.154f, 0.46f, -0.214f, 0.683f)
                curveToRelative(-0.382f, 1.427f, 0.924f, 2.733f, 2.35f, 2.351f)
                curveToRelative(0.224f, -0.06f, 0.463f, -0.14f, 0.684f, -0.214f)
                lineToRelative(0.086f, -0.03f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.729f, -0.22f)
                curveToRelative(0.487f, -0.12f, 0.8f, -0.11f, 1.01f, -0.005f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21.75f)
                curveToRelative(5.385f, 0f, 9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
            }
        }.build()

        return _Chat!!
    }

@Suppress("ObjectPropertyName")
private var _Chat: ImageVector? = null
