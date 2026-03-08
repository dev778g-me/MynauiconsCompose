package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Headphones: ImageVector
    get() {
        if (_Headphones != null) {
            return _Headphones!!
        }
        _Headphones = ImageVector.Builder(
            name = "Outline.Headphones",
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
                moveTo(21f, 17f)
                verticalLineToRelative(-5f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -18f, 0f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 14.958f)
                curveToRelative(0f, -0.511f, 0f, -0.767f, 0.059f, -0.97f)
                curveToRelative(0.135f, -0.468f, 0.49f, -0.824f, 0.93f, -0.934f)
                curveToRelative(1.272f, -0.318f, 1.53f, 0.864f, 2.443f, 1.232f)
                lineToRelative(0.069f, 0.028f)
                curveToRelative(0.992f, 0.417f, 1.497f, 1.478f, 1.495f, 2.554f)
                verticalLineToRelative(0.357f)
                curveToRelative(-0.003f, 0.95f, -0.51f, 1.835f, -1.353f, 2.272f)
                curveToRelative(-0.939f, 0.485f, -1.252f, 1.752f, -2.615f, 1.46f)
                curveToRelative(-0.437f, -0.094f, -0.797f, -0.429f, -0.95f, -0.883f)
                curveTo(16f, 19.843f, 16f, 19.54f, 16f, 18.938f)
                close()
                moveTo(8f, 19.042f)
                curveToRelative(0f, 0.511f, 0f, 0.766f, -0.059f, 0.97f)
                curveToRelative(-0.135f, 0.468f, -0.49f, 0.824f, -0.93f, 0.934f)
                curveToRelative(-1.272f, 0.318f, -1.53f, -0.865f, -2.443f, -1.232f)
                lineToRelative(-0.062f, -0.025f)
                curveToRelative(-0.998f, -0.418f, -1.504f, -1.48f, -1.502f, -2.557f)
                verticalLineToRelative(-0.364f)
                curveToRelative(0.003f, -0.946f, 0.509f, -1.828f, 1.353f, -2.265f)
                curveToRelative(0.939f, -0.485f, 1.252f, -1.752f, 2.615f, -1.46f)
                curveToRelative(0.437f, 0.094f, 0.797f, 0.429f, 0.95f, 0.883f)
                curveToRelative(0.078f, 0.231f, 0.078f, 0.533f, 0.078f, 1.136f)
                close()
            }
        }.build()

        return _Headphones!!
    }

@Suppress("ObjectPropertyName")
private var _Headphones: ImageVector? = null
