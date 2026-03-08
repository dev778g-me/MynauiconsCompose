package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.LetterS: ImageVector
    get() {
        if (_LetterS != null) {
            return _LetterS!!
        }
        _LetterS = ImageVector.Builder(
            name = "Outline.LetterS",
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
                moveTo(15.25f, 8.563f)
                verticalLineTo(8.25f)
                curveTo(15.25f, 7.56f, 14.69f, 7f, 14f, 7f)
                horizontalLineToRelative(-3.75f)
                curveTo(9.56f, 7f, 9f, 7.56f, 9f, 8.25f)
                verticalLineToRelative(1.23f)
                curveToRelative(0f, 0.767f, 0.467f, 1.457f, 1.179f, 1.742f)
                lineToRelative(3.892f, 1.556f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.179f, 1.741f)
                verticalLineToRelative(1.231f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3.75f)
                curveTo(9.56f, 17f, 9f, 16.44f, 9f, 15.75f)
                verticalLineToRelative(-0.312f)
            }
        }.build()

        return _LetterS!!
    }

@Suppress("ObjectPropertyName")
private var _LetterS: ImageVector? = null
