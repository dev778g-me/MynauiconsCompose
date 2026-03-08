package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CheckSquareOne: ImageVector
    get() {
        if (_CheckSquareOne != null) {
            return _CheckSquareOne!!
        }
        _CheckSquareOne = ImageVector.Builder(
            name = "Outline.CheckSquareOne",
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
                moveToRelative(9f, 8.806f)
                lineToRelative(3.562f, 3.94f)
                arcToRelative(0.788f, 0.788f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.206f, -0.055f)
                lineTo(21f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.4f, 3f)
                curveToRelative(-2.24f, 0f, -3.36f, 0f, -4.216f, 0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.748f, 1.748f)
                curveTo(3f, 6.04f, 3f, 7.16f, 3f, 9.4f)
                verticalLineToRelative(5.2f)
                curveToRelative(0f, 2.24f, 0f, 3.36f, 0.436f, 4.216f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.748f, 1.748f)
                curveTo(6.04f, 21f, 7.16f, 21f, 9.4f, 21f)
                horizontalLineToRelative(5.2f)
                curveToRelative(2.24f, 0f, 3.36f, 0f, 4.216f, -0.436f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.748f, -1.748f)
                curveTo(21f, 17.96f, 21f, 16.84f, 21f, 14.6f)
                verticalLineToRelative(-1.1f)
            }
        }.build()

        return _CheckSquareOne!!
    }

@Suppress("ObjectPropertyName")
private var _CheckSquareOne: ImageVector? = null
