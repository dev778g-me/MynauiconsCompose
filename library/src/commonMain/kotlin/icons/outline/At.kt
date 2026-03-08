package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.At: ImageVector
    get() {
        if (_At != null) {
            return _At!!
        }
        _At = ImageVector.Builder(
            name = "Outline.At",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 11.996f)
                verticalLineTo(7.998f)
                moveToRelative(0f, 3.998f)
                curveToRelative(0f, -5.157f, -8f, -5.157f, -8f, 0f)
                curveToRelative(0f, 5.167f, 8f, 5.11f, 8f, 0f)
                moveToRelative(0f, 0f)
                curveToRelative(0f, 5f, 5f, 5f, 5f, 0f)
                curveTo(21f, 7.027f, 16.97f, 3f, 12f, 3f)
                reflectiveCurveToRelative(-9f, 4.027f, -9f, 8.996f)
                curveToRelative(0f, 4.968f, 4.03f, 8.995f, 9f, 8.995f)
                curveToRelative(1.675f, 0.084f, 3.938f, -0.421f, 5.776f, -1.831f)
            }
        }.build()

        return _At!!
    }

@Suppress("ObjectPropertyName")
private var _At: ImageVector? = null
