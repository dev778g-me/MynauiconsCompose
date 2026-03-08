package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Crosshair: ImageVector
    get() {
        if (_Crosshair != null) {
            return _Crosshair!!
        }
        _Crosshair = ImageVector.Builder(
            name = "Outline.Crosshair",
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
                moveTo(21f, 12f)
                horizontalLineToRelative(-3f)
                moveTo(6f, 12f)
                horizontalLineTo(3f)
                moveToRelative(9f, -6f)
                verticalLineTo(3f)
                moveToRelative(0f, 18f)
                verticalLineToRelative(-3f)
                moveToRelative(9f, -6f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
            }
        }.build()

        return _Crosshair!!
    }

@Suppress("ObjectPropertyName")
private var _Crosshair: ImageVector? = null
