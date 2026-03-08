package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MapPinned: ImageVector
    get() {
        if (_MapPinned != null) {
            return _MapPinned!!
        }
        _MapPinned = ImageVector.Builder(
            name = "Outline.MapPinned",
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
                moveToRelative(6.5f, 17f)
                lineToRelative(-2f, 4f)
                horizontalLineToRelative(15f)
                lineToRelative(-2f, -4f)
                moveTo(12f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.448f, 17.84f)
                arcToRelative(0.71f, 0.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.896f, 0f)
                curveTo(7.69f, 14.78f, 3.588f, 8.487f, 7.733f, 3.94f)
                curveTo(8.865f, 2.697f, 10.4f, 2f, 12f, 2f)
                reflectiveCurveToRelative(3.135f, 0.697f, 4.267f, 1.939f)
                curveToRelative(4.145f, 4.547f, 0.044f, 10.84f, -3.82f, 13.902f)
            }
        }.build()

        return _MapPinned!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinned: ImageVector? = null
