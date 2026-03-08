package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Speaker: ImageVector
    get() {
        if (_Speaker != null) {
            return _Speaker!!
        }
        _Speaker = ImageVector.Builder(
            name = "Outline.Speaker",
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
                moveTo(9f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                moveToRelative(2.5f, -7f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                curveToRelative(3.418f, 0f, 5.127f, 0f, 6.188f, 1.318f)
                curveTo(19.25f, 5.636f, 19.25f, 7.758f, 19.25f, 12f)
                reflectiveCurveToRelative(0f, 6.364f, -1.062f, 7.682f)
                curveTo(17.127f, 21f, 15.418f, 21f, 12f, 21f)
                reflectiveCurveToRelative(-5.127f, 0f, -6.188f, -1.318f)
                curveTo(4.75f, 18.364f, 4.75f, 16.242f, 4.75f, 12f)
                reflectiveCurveToRelative(0f, -6.364f, 1.062f, -7.682f)
                curveTo(6.873f, 3f, 8.582f, 3f, 12f, 3f)
            }
        }.build()

        return _Speaker!!
    }

@Suppress("ObjectPropertyName")
private var _Speaker: ImageVector? = null
