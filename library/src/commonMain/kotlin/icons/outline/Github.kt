package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Github: ImageVector
    get() {
        if (_Github != null) {
            return _Github!!
        }
        _Github = ImageVector.Builder(
            name = "Outline.Github",
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
                moveTo(3.5f, 15.668f)
                quadToRelative(0.675f, 0.081f, 1f, 0.618f)
                curveToRelative(0.326f, 0.537f, 1.537f, 2.526f, 2.913f, 2.526f)
                horizontalLineTo(9.5f)
                moveToRelative(5.672f, -3.513f)
                quadToRelative(0.823f, 1.078f, 0.823f, 1.936f)
                verticalLineTo(21f)
                moveToRelative(-5.625f, -5.609f)
                quadToRelative(-0.87f, 0.954f, -0.869f, 1.813f)
                verticalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.172f, 15.299f)
                curveToRelative(1.202f, -0.25f, 2.293f, -0.682f, 3.14f, -1.316f)
                curveToRelative(1.448f, -1.084f, 2.188f, -2.758f, 2.188f, -4.411f)
                curveToRelative(0f, -1.16f, -0.44f, -2.243f, -1.204f, -3.16f)
                curveToRelative(-0.425f, -0.511f, 0.819f, -3.872f, -0.286f, -3.359f)
                curveToRelative(-1.105f, 0.514f, -2.725f, 1.198f, -3.574f, 0.947f)
                curveToRelative(-0.909f, -0.268f, -1.9f, -0.416f, -2.936f, -0.416f)
                curveToRelative(-0.9f, 0f, -1.766f, 0.111f, -2.574f, 0.317f)
                curveToRelative(-1.174f, 0.298f, -2.296f, -0.363f, -3.426f, -0.848f)
                curveToRelative(-1.13f, -0.484f, -0.513f, 3.008f, -0.849f, 3.422f)
                curveTo(4.921f, 7.38f, 4.5f, 8.44f, 4.5f, 9.572f)
                curveToRelative(0f, 1.653f, 0.895f, 3.327f, 2.343f, 4.41f)
                curveToRelative(0.965f, 0.722f, 2.174f, 1.183f, 3.527f, 1.41f)
            }
        }.build()

        return _Github!!
    }

@Suppress("ObjectPropertyName")
private var _Github: ImageVector? = null
