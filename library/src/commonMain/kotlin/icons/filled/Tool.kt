package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Tool: ImageVector
    get() {
        if (_Tool != null) {
            return _Tool!!
        }
        _Tool = ImageVector.Builder(
            name = "Filled.Tool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.14f, 2.25f)
                arcToRelative(5.61f, 5.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.327f, 7.376f)
                lineTo(2.77f, 17.671f)
                arcToRelative(1.774f, 1.774f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.508f)
                lineToRelative(1.052f, 1.052f)
                arcToRelative(1.773f, 1.773f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.509f, 0f)
                lineToRelative(8.044f, -8.045f)
                arcToRelative(5.61f, 5.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.19f, -6.765f)
                curveToRelative(-0.266f, -1.004f, -1.442f, -1.104f, -2.032f, -0.514f)
                lineTo(17.81f, 7.629f)
                arcToRelative(1.017f, 1.017f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.438f, -1.438f)
                lineToRelative(1.722f, -1.723f)
                curveToRelative(0.59f, -0.59f, 0.49f, -1.766f, -0.515f, -2.032f)
                arcToRelative(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.438f, -0.186f)
            }
        }.build()

        return _Tool!!
    }

@Suppress("ObjectPropertyName")
private var _Tool: ImageVector? = null
