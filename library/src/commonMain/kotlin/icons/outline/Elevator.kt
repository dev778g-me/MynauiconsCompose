package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Elevator: ImageVector
    get() {
        if (_Elevator != null) {
            return _Elevator!!
        }
        _Elevator = ImageVector.Builder(
            name = "Outline.Elevator",
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
                moveTo(12f, 8.294f)
                horizontalLineToRelative(4.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineTo(12f)
                moveToRelative(0f, -12.706f)
                horizontalLineTo(7.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineTo(12f)
                moveToRelative(0f, -12.706f)
                verticalLineTo(21f)
                moveTo(7.125f, 4.588f)
                lineTo(8.75f, 3f)
                lineToRelative(1.625f, 1.588f)
                moveTo(13.625f, 3f)
                lineToRelative(1.625f, 1.588f)
                lineTo(16.875f, 3f)
            }
        }.build()

        return _Elevator!!
    }

@Suppress("ObjectPropertyName")
private var _Elevator: ImageVector? = null
