package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MoonStar: ImageVector
    get() {
        if (_MoonStar != null) {
            return _MoonStar!!
        }
        _MoonStar = ImageVector.Builder(
            name = "Outline.MoonStar",
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
                moveTo(21f, 12.808f)
                curveToRelative(-0.5f, 5.347f, -5.849f, 9.14f, -11.107f, 7.983f)
                curveTo(-0.078f, 18.6f, 1.15f, 3.909f, 11.11f, 3f)
                curveTo(6.395f, 9.296f, 14.619f, 17.462f, 21f, 12.808f)
                moveTo(17f, 5.5f)
                horizontalLineToRelative(3f)
                moveTo(18.5f, 4f)
                verticalLineToRelative(3f)
            }
        }.build()

        return _MoonStar!!
    }

@Suppress("ObjectPropertyName")
private var _MoonStar: ImageVector? = null
