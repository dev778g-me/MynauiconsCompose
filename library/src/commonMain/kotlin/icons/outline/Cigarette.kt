package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cigarette: ImageVector
    get() {
        if (_Cigarette != null) {
            return _Cigarette!!
        }
        _Cigarette = ImageVector.Builder(
            name = "Outline.Cigarette",
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
                moveTo(3f, 10f)
                curveToRelative(0f, -1.5f, 2f, -3.5f, 2f, -5f)
                moveToRelative(1.5f, 5f)
                curveToRelative(0f, -1.5f, 2f, -3.5f, 2f, -5f)
                moveToRelative(1.5f, 5f)
                curveToRelative(0f, -1.5f, 2f, -3.5f, 2f, -5f)
                moveToRelative(4f, 8f)
                verticalLineToRelative(4f)
                moveTo(3f, 14f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
            }
        }.build()

        return _Cigarette!!
    }

@Suppress("ObjectPropertyName")
private var _Cigarette: ImageVector? = null
